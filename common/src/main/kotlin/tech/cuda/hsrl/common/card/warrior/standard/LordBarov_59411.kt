package tech.cuda.hsrl.common.card.warrior.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class LordBarov_59411 : Card() {
    override val id = 59411
    override val name = "巴罗夫领主"
    override val description = "<b>战吼：</b>将所有其他随从的生命值变为1。<b>亡语：</b>对所有随从造成1点伤害。"
    override var cost: Int? = 3
    override var health: Int? = 2
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "阿雷克斯·巴罗夫把学院交给了克尔苏加德，却仍留在这里。他说是为了“监督”。"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/a66aa2930e2339290a393cdeb50ca3782122d9d5e37767fa03fb5a4a9a68e6b4.png"
}

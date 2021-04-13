package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class KaboomBot_49279 : Card() {
    override val id = 49279
    override val name = "爆爆机器人"
    override val description = "<b>亡语：</b>随机对一个敌方随从造成4点伤害。"
    override var cost: Int? = 3
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.BoomsdayProject
    override val background = "炸弹一响，黄金万两。"
    override val artist = "Tyler West Studio"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/36a33bc6724f1f7c28f8bdd3d164bbfb0507f2ec4bc42e96a8d4dee503629ca8.png"
}

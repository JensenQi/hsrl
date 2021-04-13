package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class RasFrostwhisper_59216 : Card() {
    override val id = 59216
    override val name = "莱斯·霜语"
    override val description = "在你的回合结束时，对所有敌人造成 1点伤害<i>（受<b>法术伤害</b>加成影响）</i>。"
    override var cost: Int? = 5
    override var health: Int? = 6
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "尽管其他教职员工总是对莱斯冷语相向，他一直都是克尔苏加德校长最欣赏的那一个。"
    override val artist = "Luke Mancini"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/272949a630c2eb0e3ec729ac31a76cd213acae01beadee5c9df227ee254dc5b1.png"
}

package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ConvincingInfiltrator_51714 : Card() {
    override val id = 51714
    override val name = "无面渗透者"
    override val description = "<b>嘲讽</b> <b>亡语：</b>随机消灭一个敌方随从。"
    override var cost: Int? = 5
    override var health: Int? = 6
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.RiseOfShadows
    override val background = "有人模仿我的脸，还有人模仿我的面。"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/621b45c35f9122bf4d326effbc9d0c902d667c30762b6751f9731051ef7a6adf.png"
}

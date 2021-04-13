package tech.cuda.hsrl.common.card.demonhunter.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Felosophy_59726 : Card() {
    override val id = 59726
    override val name = "邪能学说"
    override val description = "复制你手牌中法力值消耗最低的恶魔牌。<b>流放：</b>使这两张恶魔牌获得+1/+1。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Demonhunter
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "不要再念邪音了，要扣钱的。"
    override val artist = "Adam Byrne"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d3418516a0f3ce1cf9bb8147ab6bab31f526bcad49d11610e003f7b9945844eb.png"
}

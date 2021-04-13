package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class RazorpetalVolley_41207 : Card() {
    override val id = 41207
    override val name = "刀瓣齐射"
    override val description = "将两张可造成1点伤害的“刀瓣”置入你的手牌。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.Ungoro
    override val background = "经常不洗澡的人，会有头皮屑。经常不洗澡的花…"
    override val artist = "Chanchai Luechaiwattanasopon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d7f230ddab2870f852f7ea0bd4f0e7d358365d508067c13cabdc01ebf073e8ed.png"
}

package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AltarOfFire_63211 : Card() {
    override val id = 63211
    override val name = "火焰祭坛"
    override val description = "摧毁双方牌库顶的三张牌。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "“我在此呼唤你的名字：又酥又脆！”"
    override val artist = "Evgeniy Dlinnov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e4867b4d073928b26809f0f354e8a364e490ec67e81bbcfea903f32a0e26c0da.png"
}

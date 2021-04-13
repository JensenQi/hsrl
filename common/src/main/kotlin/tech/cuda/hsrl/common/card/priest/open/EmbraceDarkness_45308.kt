package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class EmbraceDarkness_45308 : Card() {
    override val id = 45308
    override val name = "黑暗之拥"
    override val description = "选择一个敌方随从。在你的回合开始时，获得该随从的 控制权。"
    override var cost: Int? = 6
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.Kotf
    override val background = "拥抱黑暗，主宰命运！"
    override val artist = "A. J. Nazzaro"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7915bf4a9e0ab8c04565054cfd42e7f774e1839da880ef5f99efd62fe2e5c64b.png"
}

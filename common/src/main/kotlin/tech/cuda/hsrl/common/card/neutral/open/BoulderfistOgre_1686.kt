package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BoulderfistOgre_1686 : Card() {
    override val id = 1686
    override val name = "石拳食人魔"
    override val description = ""
    override var cost: Int? = 6
    override var health: Int? = 7
    override var attack: Int? = 6
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy1635
    override val background = "“我非常厉害，绝对值这个价格！”"
    override val artist = "Brian Despain"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/92abb50da7151878e23e5c87f1b222ca3c0ff82c54ce26eaeb928ef7072d61d4.png"
}

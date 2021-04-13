package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SilverbackPatriarch_67 : Card() {
    override val id = 67
    override val name = "银背族长"
    override val description = "<b>嘲讽</b>"
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy1635
    override val background = "尽管他表现得像个领导者，但实际上银背母猩猩才是真正管事的人。"
    override val artist = "Daren Bader"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7891767156e3f78f46db2c10d780c4ffdbe413ec0fb42c12a2ab7ce85f361da6.png"
}

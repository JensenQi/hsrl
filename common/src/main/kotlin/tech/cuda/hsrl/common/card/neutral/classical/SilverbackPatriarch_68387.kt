package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SilverbackPatriarch_68387 : Card() {
    override val id = 68387
    override val name = "银背族长"
    override val description = "<b>嘲讽</b>"
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = 1
    
    override val isClassic = true
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "尽管他表现得像个领导者，但实际上银背母猩猩才是真正管事的人。"
    override val artist = "Daren Bader"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/49e0151ac03d2da67c34d0a9893532b37eb0d41a70ff1eb29bf10e65273cdd2d.png"
}

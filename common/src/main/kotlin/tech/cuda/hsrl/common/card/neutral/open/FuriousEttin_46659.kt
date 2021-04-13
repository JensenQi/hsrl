package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FuriousEttin_46659 : Card() {
    override val id = 46659
    override val name = "暴怒的双头巨人"
    override val description = "<b>嘲讽</b>"
    override var cost: Int? = 7
    override var health: Int? = 9
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.TheWitchwood
    override val background = "一个叫没头脑，一个叫不高兴。"
    override val artist = "Chris Seaman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9aba41721f4d91a3783f170a87de2017abb567ad84143ac81dc06f267775358e.png"
}

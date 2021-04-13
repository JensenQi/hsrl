package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FenCreeper_69745 : Card() {
    override val id = 69745
    override val name = "沼泽爬行者"
    override val description = "<b>嘲讽</b>"
    override var cost: Int? = 5
    override var health: Int? = 6
    override var attack: Int? = 3
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "它以前被称作沼泽兽，但这个名字会让人迷惑，因为它根本不是野兽。"
    override val artist = "Monica Langlois"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/854739476057bec74576ebd023a68ab02f157ac07bc68e22f1a5e89a939caaaf.png"
}

package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BloodfenRaptor_68397 : Card() {
    override val id = 68397
    override val name = "血沼迅猛龙"
    override val description = ""
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 3
    
    override val isClassic = true
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "“去杀30条迅猛龙。”——赫米特·奈辛瓦里"
    override val artist = "Dan Brereton"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/74d5987778e053861933698c5388a181d8b472b7b7cc78c003442b689908a97b.png"
}

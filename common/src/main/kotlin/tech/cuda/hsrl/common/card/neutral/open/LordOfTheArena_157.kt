package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class LordOfTheArena_157 : Card() {
    override val id = 157
    override val name = "竞技场主宰"
    override val description = "<b>嘲讽</b>"
    override var cost: Int? = 6
    override var health: Int? = 5
    override var attack: Int? = 6
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy1635
    override val background = "他曾经是一个2100分段的竞技场高端玩家。但那已经是几年前的事情了，而且没人能阻止他继续吹嘘这件事。"
    override val artist = "E. M. Gist"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6ca72621b6fd40a311f6d69771f6656a4c939a0cc72f47f4c6d4c63ccc799159.png"
}

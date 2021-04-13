package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MountainGiant_69850 : Card() {
    override val id = 69850
    override val name = "山岭巨人"
    override val description = "你每有一张其他手牌，该牌的法力值消耗便减少（1）点。"
    override var cost: Int? = 12
    override var health: Int? = 8
    override var attack: Int? = 8
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "他的妈妈说，他只是骨架比较大而已。"
    override val artist = "Samwise"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/de5259976738ef542d6ab0ee6b1bcbb489bc4652463aea2feb8a4d07d900f479.png"
}

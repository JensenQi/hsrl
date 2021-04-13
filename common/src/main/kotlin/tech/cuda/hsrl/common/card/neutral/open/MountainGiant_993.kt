package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MountainGiant_993 : Card() {
    override val id = 993
    override val name = "山岭巨人"
    override val description = "你每有一张其他手牌，该牌的法力值消耗便减少（1）点。"
    override var cost: Int? = 12
    override var health: Int? = 8
    override var attack: Int? = 8
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy4
    override val background = "他的妈妈说，他只是骨架比较大而已。"
    override val artist = "Samwise"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/35291895df13978e7a9cd02ff4ca792aca6ab67bc9b064c4c4255ec7a80bb5e5.png"
}

package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class RaidLeader_1401 : Card() {
    override val id = 1401
    override val name = "团队领袖"
    override val description = "你的其他随从获得+1攻击力。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy1635
    override val background = "“谁再敢OT的，扣掉50DKP！”"
    override val artist = "Phill Gonzales"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/63a10a123517da0d12d6a74991c51f961483581174caf8de6ad8f70fc208aa2e.png"
}

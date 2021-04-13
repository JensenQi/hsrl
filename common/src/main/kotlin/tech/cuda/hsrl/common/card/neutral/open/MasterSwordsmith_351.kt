package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MasterSwordsmith_351 : Card() {
    override val id = 351
    override val name = "铸剑师"
    override val description = "在你的回合结束时，随机使另一个友方随从获得+1攻击力。"
    override var cost: Int? = 2
    override var health: Int? = 3
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy3
    override val background = "他正在打造一把称为“连枷斧”的武器，但是其他铸剑师都表示那是不可能做到的。"
    override val artist = "E. M. Gist"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/63b182be1ce8effdd98ca6201ef769da1524f2cb31010ce91cb26086c0e4a755.png"
}

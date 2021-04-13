package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BurrowingScorpid_57177 : Card() {
    override val id = 57177
    override val name = "潜地蝎"
    override val description = "<b>战吼：</b>造成2点伤害。如果消灭了目标，则获得<b>潜行</b>。"
    override var cost: Int? = 4
    override var health: Int? = 2
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.AshesOfOutland
    override val background = "这个游戏叫躲蝎蝎。"
    override val artist = "Jason Kang"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/bba0abe44c1e1a1817134275971e99b3a7f78acf9a851e6cb97b51a9c11ad553.png"
}

package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CheatyAnklebiter_50391 : Card() {
    override val id = 50391
    override val name = "调皮的噬踝者"
    override val description = "<b>吸血</b> <b>战吼：</b>造成1点伤害。"
    override var cost: Int? = 2
    override var health: Int? = 1
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.RastakhansRumble
    override val background = "阿喀琉斯案犯罪嫌疑人。"
    override val artist = "Ekaterina Shapovalova"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b66d93f3e9c0689490ad049bc90e6468d0c3ce45d511f62dd19cfab8cade2712.png"
}

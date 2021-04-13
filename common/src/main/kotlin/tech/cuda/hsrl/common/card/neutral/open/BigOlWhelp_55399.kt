package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BigOlWhelp_55399 : Card() {
    override val id = 55399
    override val name = "雏龙巨婴"
    override val description = "<b>战吼：</b>抽一张牌。"
    override var cost: Int? = 5
    override var health: Int? = 5
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Dragon
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.DescentOfDragons
    override val background = "萌得像个二百斤的宝宝。"
    override val artist = "Concept Art House"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ef47d2a88ce3bf75c90a6919b2aad21ecf2e7e5b2084caf040891a0bbcce5f09.png"
}

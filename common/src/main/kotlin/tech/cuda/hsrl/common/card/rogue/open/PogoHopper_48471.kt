package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class PogoHopper_48471 : Card() {
    override val id = 48471
    override val name = "蹦蹦兔"
    override val description = "<b>战吼：</b>在本局对战中，你每使用一张蹦蹦兔，便获得+2/+2。"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.BoomsdayProject
    override val background = "根本停不下来！"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/2474fd5f2ba4e3bb58d81fc0b8683f04b2bda80838433384c71fb3e5d3af00a7.png"
}

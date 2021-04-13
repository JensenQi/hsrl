package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BogSlosher_49803 : Card() {
    override val id = 49803
    override val name = "沼泽游荡者"
    override val description = "<b>战吼：</b>将一个友方随从移回你的手牌，并使其获得+2/+2。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.RastakhansRumble
    override val background = "清洁工李奥瑞克有话说。"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/97f0d988de0151e9d9e890343636366b4be0427266420eb507e3339bd512e5c2.png"
}

package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class EmberscaleDrake_50049 : Card() {
    override val id = 50049
    override val name = "烬鳞幼龙"
    override val description = "<b>战吼：</b>如果你的手牌中有龙牌，便获得5点护甲值。"
    override var cost: Int? = 5
    override var health: Int? = 5
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Dragon
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.RastakhansRumble
    override val background = "第三头幼龙吸取了草鳞幼龙和木鳞幼龙的经验，精心打造了烬鳞铠甲。"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b0fc01a5545461211108fd98d6c08c4cc49aed8eae6bbb9f4cab10c28b68a340.png"
}

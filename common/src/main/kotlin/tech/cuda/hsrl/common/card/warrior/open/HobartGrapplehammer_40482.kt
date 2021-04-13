package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class HobartGrapplehammer_40482 : Card() {
    override val id = 40482
    override val name = "霍巴特·钩锤"
    override val description = "<b>战吼：</b>使你的手牌和牌库里的所有武器牌获得+1攻击力。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.Msog
    override val background = "霍巴特就是那个发明了全自动食人鱼喷枪的家伙…瞧他那洋洋自得的样子！"
    override val artist = "A. J. Nazzaro"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/76975669b2a32d6763b30e6daa5b02aca8be0f2c0179ed72040361751cc9c036.png"
}

package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BwonsamdiTheDead_50087 : Card() {
    override val id = 50087
    override val name = "邦桑迪，死亡之神"
    override val description = "<b>战吼：</b>从你的牌库中抽取法力值消耗为（1）的随从，直到达到你的手牌上限。"
    override var cost: Int? = 7
    override var health: Int? = 7
    override var attack: Int? = 7
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.RastakhansRumble
    override val background = "“我想死你们了！”"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/086b92d6dee9dcb7b4741d7884e2dadcb00ae385dc803cec425dbeb5ca88f960.png"
}

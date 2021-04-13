package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TheBoomReaver_52086 : Card() {
    override val id = 52086
    override val name = "砰砰机甲"
    override val description = "<b>战吼：</b> 召唤一个你牌库中的随从的复制，并使其获得<b>突袭</b>。"
    override var cost: Int? = 10
    override var health: Int? = 9
    override var attack: Int? = 7
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.RiseOfShadows
    override val background = "“吃我一斧！”"
    override val artist = "Jerry Mascho"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7a03e3143d343daec01b010acb557df154b9609f9418a5d924b2947130204721.png"
}

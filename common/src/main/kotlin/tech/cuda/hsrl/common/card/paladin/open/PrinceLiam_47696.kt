package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class PrinceLiam_47696 : Card() {
    override val id = 47696
    override val name = "利亚姆王子"
    override val description = "<b>战吼：</b>将你牌库中所有法力值消耗为（1）的牌变为<b>传说</b>随从牌。"
    override var cost: Int? = 5
    override var health: Int? = 5
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.TheWitchwood
    override val background = "“我有一项非常特殊的能力，这能力会让我成为女巫的噩梦。”"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/4bea84d44c92a905aebb86e4762bf594f180d9840955a085a43617e58fe1415e.png"
}

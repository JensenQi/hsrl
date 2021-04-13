package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GelbinMekkatorque_68539 : Card() {
    override val id = 68539
    override val name = "格尔宾·梅卡托克"
    override val description = "<b>战吼：</b>召唤一项惊人的发明。"
    override var cost: Int? = 6
    override var health: Int? = 6
    override var attack: Int? = 6
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "他是侏儒的领袖，无与伦比的发明家。而且他变得越来越像个领袖了；相比他只是个发明家的时候，他已经不那么经常把人变成小鸡了。"
    override val artist = "Ludo Lullabi"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/379aef7a92ce2032fd1a517840e0aa5e8c617c5f95887fe2ffcd3a319040d607.png"
}

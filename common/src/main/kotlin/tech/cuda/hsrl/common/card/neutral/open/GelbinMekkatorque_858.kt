package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GelbinMekkatorque_858 : Card() {
    override val id = 858
    override val name = "格尔宾·梅卡托克"
    override val description = "<b>战吼：</b>召唤一项惊人的发明。"
    override var cost: Int? = 6
    override var health: Int? = 6
    override var attack: Int? = 6
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy4
    override val background = "他是侏儒的领袖，无与伦比的发明家。而且他变得越来越像个领袖了；相比他只是个发明家的时候，他已经不那么经常把人变成小鸡了。"
    override val artist = "Ludo Lullabi"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/fa92d2988496d11124049f32adc25ac955d1bf43392d1a6b1e740cca3fc36ba5.png"
}

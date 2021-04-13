package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class HagathaTheWitch_46887 : Card() {
    override val id = 46887
    override val name = "女巫哈加莎"
    override val description = "<b>战吼：</b>对所有随从造成3点伤害。"
    override var cost: Int? = 8
    override var health: Int? = 30
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Hero
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.TheWitchwood
    override val background = "吾名哈加莎，诅咒之散播者，森林的终结者。无可阻挡，无可违逆，吾只玩半藏！"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c2e49e6b5e94e2cd54a452431bfc9853d4a309f1a82cc216709a7265cca37809.png"
}

package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GenzoTheShark_40607 : Card() {
    override val id = 40607
    override val name = "“鲨鱼”加佐"
    override val description = "每当该随从进行攻击时，双方玩家抽若干数量的牌，直到拥有三张手牌。"
    override var cost: Int? = 4
    override var health: Int? = 4
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Msog
    override val background = "“乐善好施”的加佐在加基森做信贷方面的生意，他提供的贷款无需任何抵押。但你要是没能及时还上钱，缺胳膊少腿也是常有的事，这也是他“鲨鱼”名号的由来。"
    override val artist = "Garrett Hanna"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/0d2388640100667546e0ab9408db21c27525ee0e56ef2597c95c0644784c4138.png"
}

package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TolvirWarden_41354 : Card() {
    override val id = 41354
    override val name = "托维尔守卫"
    override val description = "<b>战吼：</b>从你的牌库中抽两张法力值消耗为（1）的随从牌。"
    override var cost: Int? = 5
    override var health: Int? = 5
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.Ungoro
    override val background = "作战时以勇猛著称…特别是在宠物对战里。"
    override val artist = "Mike Azevedo"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/081f4b602f9b75d172846271c2f2ea96c020cecf6fa50748e10e4e13a9748fff.png"
}

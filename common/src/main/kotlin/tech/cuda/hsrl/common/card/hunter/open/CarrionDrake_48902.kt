package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CarrionDrake_48902 : Card() {
    override val id = 48902
    override val name = "食腐飞龙"
    override val description = "<b>战吼：</b>如果在本回合中有一个随从死亡，获得<b>剧毒</b>。"
    override var cost: Int? = 5
    override var health: Int? = 7
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Dragon
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.TheWitchwood
    override val background = "这就是吃了太多腐烂食物的下场。"
    override val artist = "Steve Prescott"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/97710f40ee8fa017c3c6602beab0db220107b9ac6e32b7686e0b3f425f955146.png"
}

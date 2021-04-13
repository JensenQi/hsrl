package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ElvenArcher_68403 : Card() {
    override val id = 68403
    override val name = "精灵弓箭手"
    override val description = "<b>战吼：</b>造成1点伤害。"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "媚眼如丝，轻盈如燕，致命如箭。"
    override val artist = "Steve Prescott"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/3889fa44b62ed414c4beddeb024ff4c1e068b54ae8839d3ea645a9fb57df183d.png"
}

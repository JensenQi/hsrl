package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Skybarge_55004 : Card() {
    override val id = 55004
    override val name = "空中炮艇"
    override val description = "在你召唤一个海盗后，随机对一个敌人造成2点伤害。"
    override var cost: Int? = 3
    override var health: Int? = 5
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.DescentOfDragons
    override val background = "与其说是空中炮艇，不如说是艇型火炮。"
    override val artist = "Steve Prescott"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/bcca17b27907f3deabd069b4b1f111fffb03addfa69f615c98d09631f772e648.png"
}

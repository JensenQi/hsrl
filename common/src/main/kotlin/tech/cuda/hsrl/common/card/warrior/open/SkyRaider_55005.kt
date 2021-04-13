package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SkyRaider_55005 : Card() {
    override val id = 55005
    override val name = "空中悍匪"
    override val description = "<b>战吼：</b>随机将一张海盗牌置入你的手牌。"
    override var cost: Int? = 1
    override var health: Int? = 2
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Pirate
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.DescentOfDragons
    override val background = "或许他应该构思一个能把战利品也一块带回来的飞行方案。"
    override val artist = "Ivan Fomin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c46f35addfa4b268096a0285a31a7265a875523edb2b2e673a53896b66b39101.png"
}

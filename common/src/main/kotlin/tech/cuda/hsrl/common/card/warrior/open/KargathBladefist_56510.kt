package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class KargathBladefist_56510 : Card() {
    override val id = 56510
    override val name = "卡加斯·刃拳"
    override val description = "<b>突袭</b> <b>亡语：</b>将“终极卡加斯”洗入你的牌库。"
    override var cost: Int? = 4
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.AshesOfOutland
    override val background = "碎手氏族兽人的铁腕……不，刃拳领袖。"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/5d01ab5a307a300ff7331b2f60eade5da0c5d5b7d362a35f7e0384f8d6dd221e.png"
}

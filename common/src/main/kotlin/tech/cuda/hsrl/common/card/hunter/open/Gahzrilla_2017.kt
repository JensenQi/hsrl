package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Gahzrilla_2017 : Card() {
    override val id = 2017
    override val name = "加兹瑞拉"
    override val description = "每当该随从受到伤害，便使其攻击力 翻倍。"
    override var cost: Int? = 7
    override var health: Int? = 9
    override var attack: Int? = 6
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.Gvg
    override val background = "祖尔法拉克队是本届巨魔世界杯的夺冠热门球队，他们的队旗上描绘着令人望而生畏的多头蛇加兹瑞拉。"
    override val artist = "Raymond Swanland"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/a99ccb425c412483465c65f998944c1c443b4f5910a5df4ac28512ba9ae1a849.png"
}

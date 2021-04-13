package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class LightforgedCrusader_55067 : Card() {
    override val id = 55067
    override val name = "光铸远征军"
    override val description = "<b>战吼：</b>如果你的牌库中没有中立卡牌，随机将五张圣骑士卡牌置入你的手牌。"
    override var cost: Int? = 7
    override var health: Int? = 7
    override var attack: Int? = 7
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.DescentOfDragons
    override val background = "自封的“唯有圣骑”俱乐部会长。"
    override val artist = "Adam Byrne"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/679883178ab1389dbe2e72254d364b0cd1a2af4fbccd77296dba51826f089998.png"
}

package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class WickedWhispers_61648 : Card() {
    override val id = 61648
    override val name = "邪恶低语"
    override val description = "弃掉你手牌中法力值消耗最低的牌。使你的所有随从获得+1/+1。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "古神低语之际，万物惊叫之时。"
    override val artist = "E. Li & K. Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/5fb679fdc5dc9e15888d1fbb69c900b575320d2b70752715be2274f1a2985940.png"
}

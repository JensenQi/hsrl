package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DontFeedTheAnimals_61846 : Card() {
    override val id = 61846
    override val name = "请勿投食"
    override val description = "使你手牌中的所有野兽牌获得+1/+1。<b>腐蚀：</b>改为+2/+2。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "上次有人给蜥蜴喂了干蜜饯，状况惨烈，直到现在还没清理完。"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/734c5e9b90a188f1d5ca01d513f0039121dc64712fa8df7781d3dbdb939d29c0.png"
}

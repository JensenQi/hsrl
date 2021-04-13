package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FishyFlyer_59911 : Card() {
    override val id = 59911
    override val name = "鱼人飞骑"
    override val description = "<b>突袭，亡语：</b>将一个4/3并具有<b>突袭</b>的幽灵置入你的手牌。"
    override var cost: Int? = 4
    override var health: Int? = 3
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Murloc
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "表现堪称如鱼离水。"
    override val artist = "Jim Nelson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/a33af6867093dd9a945c288575cf7b734ad73641feaf02dfc0b1ae057bc2c264.png"
}

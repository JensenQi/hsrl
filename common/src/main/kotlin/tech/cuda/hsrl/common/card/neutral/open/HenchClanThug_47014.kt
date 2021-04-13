package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class HenchClanThug_47014 : Card() {
    override val id = 47014
    override val name = "荆棘帮暴徒"
    override val description = "在你的英雄攻击后，该随从获得+1/+1。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.TheWitchwood
    override val background = "月底缺钱吗？讨厌探险者协会吗？来加入我们吧！"
    override val artist = "A. J. Nazzaro"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6c4f120766f4eed30cda657de58511290f5a6db575a86d62769c88e2e9e0305d.png"
}

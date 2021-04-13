package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MysteryWinner_61682 : Card() {
    override val id = 61682
    override val name = "神秘获奖者"
    override val description = "<b>战吼：</b> <b>发现</b>一张<b>奥秘</b>牌。"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "奖品就是奖品，但神秘奖品可以是任何奖品！甚至可能是条船！"
    override val artist = "Ivan Fomin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f95566c8a11c8b9f7f99cd4438bf9e8d0de7ea4d60ea8f28e21ab42490f60fed.png"
}

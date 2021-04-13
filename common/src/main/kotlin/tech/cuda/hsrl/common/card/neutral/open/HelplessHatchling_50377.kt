package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class HelplessHatchling_50377 : Card() {
    override val id = 50377
    override val name = "无助的幼雏"
    override val description = "<b>亡语：</b>使你手牌中的一张野兽牌法力值消耗减少（1）点。"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.RastakhansRumble
    override val background = "卖萌也没用，不要再摆动小翅膀了嘤嘤嘤！"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/2261d247e30516d255a88bdb1829598cf9abb9a4e00063cfd105a7ae19f148fa.png"
}

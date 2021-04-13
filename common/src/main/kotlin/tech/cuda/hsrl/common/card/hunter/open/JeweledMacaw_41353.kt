package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class JeweledMacaw_41353 : Card() {
    override val id = 41353
    override val name = "宝石鹦鹉"
    override val description = "<b>战吼：</b>随机将一张野兽牌置入你的手牌。"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.Ungoro
    override val background = "地精珠宝商慕名而来，失望而归…"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/eb8281d8fb14db18dc7fd68522dadff3c591d137b4e9f71d7b464b0eb09a60cd.png"
}

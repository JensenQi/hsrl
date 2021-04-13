package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class HexLordMalacrass_50095 : Card() {
    override val id = 50095
    override val name = "妖术领主玛拉卡斯"
    override val description = "<b>战吼：</b>将你的起始手牌的复制置入手牌<i>（不包括这张牌）</i>。"
    override var cost: Int? = 8
    override var health: Int? = 5
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.RastakhansRumble
    override val background = "妖术领主玛拉基斯的表弟。"
    override val artist = "Mike Sass"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/797723dd2c82ce30fb47624dbc7e9f331865200489b8969473ea261c74161d6f.png"
}

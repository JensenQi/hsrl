package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Pyromaniac_50084 : Card() {
    override val id = 50084
    override val name = "火焰狂人"
    override val description = "每当你的英雄技能消灭一个随从，抽 一张牌。"
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.RastakhansRumble
    override val background = "你看我火吗？"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/87a384bae775371a6bec0b08c5e4db61fa7c73f40735b65d54cc4ce41ad3afa0.png"
}

package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CannonBarrage_50779 : Card() {
    override val id = 50779
    override val name = "火炮弹幕"
    override val description = "随机对一个敌人造成 3点伤害。你每有一个海盗，就重复 一次。"
    override var cost: Int? = 6
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.RastakhansRumble
    override val background = "既然能火力全开，干嘛还要省着点来？"
    override val artist = "Arthur Bozonnet"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9461f2bda527d9509160969900592ada70344fb1df157969a3e67e1791de22fd.png"
}

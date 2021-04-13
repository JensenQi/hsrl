package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Cataclysm_46286 : Card() {
    override val id = 46286
    override val name = "大灾变"
    override val description = "消灭所有随从。弃掉你的 手牌。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "快跑啊！天上下蜡烛啦！"
    override val artist = "L. Lullabi & K. Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1b3ba1eadf9fdf9fb147c24981f6eb5452aac0f26a6d97d18563d869745213c4.png"
}

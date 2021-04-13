package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class LevelUp_45877 : Card() {
    override val id = 45877
    override val name = "等级提升"
    override val description = "使你的白银之手新兵获得+2/+2和<b>嘲讽</b>。"
    override var cost: Int? = 6
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "叮！免费直升！"
    override val artist = "Wayne Reynolds"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b9e0f5743988bcb200fbb12f1218ac4fde5e2d64192d47d0b86b5ce33ce51955.png"
}

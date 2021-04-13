package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class HighPriestThekal_50126 : Card() {
    override val id = 50126
    override val name = "高阶祭司塞卡尔"
    override val description = "<b>战吼：</b>保留英雄的1点生命值，将其余部分转化为护甲值。"
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.RastakhansRumble
    override val background = "“一血反杀，啧啧，真刺激！”"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/5653a0339525f88e8d740c9f51f12ecca5dee0e91d240729daa149fb1b616b6a.png"
}

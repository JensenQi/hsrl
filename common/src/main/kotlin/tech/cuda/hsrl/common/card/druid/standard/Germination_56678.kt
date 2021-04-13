package tech.cuda.hsrl.common.card.druid.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Germination_56678 : Card() {
    override val id = 56678
    override val name = "萌芽分裂"
    override val description = "召唤一个友方随从的复制。使复制获得<b>嘲讽</b>。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.AshesOfOutland
    override val background = "我开始后悔问孢子人是怎么来的了。"
    override val artist = "Max Grecke"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/8138d594e7f701cfa4f45bf570c69807ba5251fe58332fddc7f7d7e4e30c4a28.png"
}
